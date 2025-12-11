package com.spring.api.version.header.parameter;


import java.util.*;

record Books(List<Book> books){
        public static Books of(List<Book> books) {
            return new Books(books);
        }
}
