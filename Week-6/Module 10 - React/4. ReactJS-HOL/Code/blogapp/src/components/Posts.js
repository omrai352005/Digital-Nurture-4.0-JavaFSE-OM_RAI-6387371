import React, { Component } from 'react';
import { Post } from '../Post';

import '../App.css'; 

export class Posts extends Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: [],
            hasError: false
        };
    }

    loadPosts() {
        fetch('https://jsonplaceholder.typicode.com/posts')
            .then(response => response.json())
            .then(data => {
                const postList = data.map(post => new Post(post.id, post.title, post.body));
                this.setState({ posts: postList });
            })
            .catch(error => {
                alert("Failed to load posts.");
                console.error('Fetch error:', error);
            });
    }

    componentDidMount() {
        this.loadPosts();
    }

    // Step 8: render all posts
    render() {
        return (
            <div>
                <h1 className="centered">All Posts</h1>
                {this.state.posts.map(post => (
                    <div className="post-box" key={post.id}>
                        <div className="post-title">{post.title}</div>
                        <div className="post-body">{post.body}</div>
                    </div>
                ))}
            </div>

        );
    }

    // Step 9: error boundary handler
    componentDidCatch(error, info) {
        this.setState({ hasError: true });
        alert("An error occurred in the Posts component.");
        console.error('Error caught in Posts:', error, info);
    }
}

