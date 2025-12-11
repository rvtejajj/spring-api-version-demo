package com.spring.api.version.media.type;


import java.util.*;

record Books(List<Book> books){
        public static Books of(List<Book> books) {
            return new Books(books);
        }
}
