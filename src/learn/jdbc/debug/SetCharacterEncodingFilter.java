package learn.jdbc.debug;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SetCharacterEncodingFilter implements Filter{
 private String encoding = null;
 private FilterConfig fc = null;
 
 public void destroy() {
  this.encoding = null;
  this.fc = null;  
 }

 public void doFilter(ServletRequest request, ServletResponse response,
   FilterChain chain) throws IOException, ServletException {
    System.out.println("setCharacterEncoding");
    request.setCharacterEncoding(this.encoding);
    chain.doFilter(request, response);
 }

 public void init(FilterConfig filterConfig) throws ServletException {
  this.encoding = filterConfig.getInitParameter("encoding");  
 }
 
}