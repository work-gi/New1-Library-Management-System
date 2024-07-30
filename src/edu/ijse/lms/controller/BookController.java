/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.lms.controller;

import edu.ijse.lms.dto.BookDto;
import edu.ijse.lms.service.ServiceFactory;
import edu.ijse.lms.service.custom.BookService;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class BookController {
    
    private BookService bookservice=(BookService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BOOK);
    
    public String saveBook(BookDto bookDto)throws Exception{
        return bookservice.saveBook(bookDto);
    }
    
    public String updateBook(BookDto bookDto)throws Exception{
        return bookservice.updateBook(bookDto);
    }
    
    public String deleteBook(String bookID)throws Exception{
        return bookservice.deleteBook(bookID);
    }
    
    public ArrayList<BookDto> getAll() throws Exception{
        return bookservice.getAll();
    }

    public BookDto get(String bookID)throws Exception{
        return bookservice.get(bookID);
                
    }
}
