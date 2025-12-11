package com.demo.api.version.path;


import java.util.*;

record Books(List<Book> books){
        public static Books of(List<Book> books) {
            return new Books(books);
        }
}
