package com.demo.api.version.query;


import java.util.List;

record Books(List<Book> books){
        public static Books of(List<Book> books) {
            return new Books(books);
        }
}
