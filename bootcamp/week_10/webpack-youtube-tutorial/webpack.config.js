const path = require('path');
const HtmlWebpackPlugin = require('html-webpack-plugin');

module.exports = {
    mode: 'development',
    entry: {
        bundle: path.resolve(__dirname, 'src/index.js'), // entry point
    },
    output: {
        path: path.resolve(__dirname, 'dist'), // output folder
        filename: '[name][contenthash].js', // output file
        clean: true, // clean dist folder before each build
        assetModuleFilename: '[name][ext]', // output images to dist folder keeps name the same
    },
    devtool: 'source-map',
    devServer: {
        static: {
            directory: path.resolve(__dirname, 'dist'),
        },
        port: 3000,
        open: true,
        hot: true,
        compress: true,
        historyApiFallback: true,
    },
    module: {
        rules: [
            {
                test: /\.scss$/, // regex to find scss files
                use: [
                    'style-loader', // 3. Inject styles into DOM
                    'css-loader', // 2. Turns css into commonjs
                    'sass-loader' // 1. Turns sass into css
                ],
            },
            {
                test: /\.js$/, // regex to find js files
                exclude: /node_modules/, // exclude node_modules folder
                use: {
                    loader: 'babel-loader', // transpile js files
                    options: {
                        presets: ['@babel/preset-env'], // use latest js features
                    },
                },
            },
            {
                test: /\.(png|svg|jpg|jpeg|gif)$/i, // regex to find image files
                type: 'asset/resource', // emit images to output folder
            },
        ],
    },
        plugins: [
            new HtmlWebpackPlugin({
                title: 'Webpack Youtube Tutorial',
                filename: 'index.html',
                template: 'src/template.html',
            }),
        ],
    };   