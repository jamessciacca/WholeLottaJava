const htmlWebpackPlugin = require('html-webpack-plugin');
const path = require('path');

module.exports = {
    entry: './src/index.js',
    output: {
        path: path.join(process.cwd(), 'dist'),
        filename: 'bundle.js'
    },
    module: {
        rules: [
          {
            test: /\.css$|\.s[ac]ss$/i,
            use: ["style-loader", "css-loader", "sass-loader"],
          },
        ],
      },
    plugins: [new htmlWebpackPlugin({
        template: './src/index.html',
        title: 'Webpack Class Review',
        inject: 'body',
        templateParameters: {
            header: 'Our header text'
        }
    }
    )
],
};