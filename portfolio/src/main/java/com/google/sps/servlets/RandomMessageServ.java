package com.google.sps.servlets;
import java.util.Arrays;
import java.io.IOException;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/random")
public class RandomMessageServ extends HttpServlet{
    public String[] list = {"Bananas", "Grapes", "Apples", "Oranges", "Mango"};
@Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html;");
    response.getWriter().println("Random Message = " + convertToJson(list));
  }
private String convertToJson(String[] arr){
    String json = list[(int) Math.floor(Math.random())];
    return json;
  }

