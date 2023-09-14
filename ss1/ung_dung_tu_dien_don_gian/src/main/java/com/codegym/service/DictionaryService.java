package com.codegym.service;

import org.springframework.stereotype.Service;

@Service
public class DictionaryService {
    public String searchResult(String search) {
        if (search.equals("Hello")){
            return "Xin Chào";
        } else if (search.equals("Goodbye")) {
            return "Tạm Biệt";
        } else if (search.equals("Thanks")) {
            return "Cảm ơn";
        } else if (search.equals("Good night")) {
            return "Chúc bạn ngủ ngon";
        }
        return "Không tìm thấy kết quả";
    }
}
