// TODO: Create a class constructor named ForumItem that takes in 'authorName', 'text', and 'createdOn'.
class ForumItem{
  constructor(authorName, text, createdOn) {
    this.authorName = authorName;
    
    this.text = text;
    this.createdOn = createdOn;
    
}
}
// TODO: Setup BlogPost and Comment so they inherit their structure from ForumItem.
class BlogPost extends ForumItem{
  constructor(authorName, title, text, createdOn) {

    super()

    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.createdOn = createdOn;
    this.comments = [];
  }

  addComment(comment) {
    this.comments.push(comment);
  }
}

class Comment extends ForumItem{
  constructor(authorName, text, createdOn, reaction) {
    super(authorName, text, createdOn)
    this.reaction = reaction;
  }
}

const myComment = new Comment('James', 'Random Text', '12/12/12', 'Thumbs Up!')
// TODO: Create a new object using the Comment class constructor.
const myBlog = new BlogPost('James', 'Random Text', '12/12/12', 'Thumbs Up!')
// TODO: Create a new object using the BlogPost class constructor.

// TODO: Log both newly created BlogPost and Comment to the console.
