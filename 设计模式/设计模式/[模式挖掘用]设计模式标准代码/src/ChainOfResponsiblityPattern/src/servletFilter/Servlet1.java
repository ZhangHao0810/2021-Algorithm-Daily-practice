package ChainOfResponsiblityPattern.src.servletFilter;


import java.io.*;
import java.util.*;

public class Servlet1  implements Filter {
    private FilterConfig filterConfig;
    //Handle the passed-in FilterConfig
    public void init(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
    }
    //Process the request/response pair
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) {
        try {

            filterChain.doFilter(request, response);
        }
        catch(ServletException sx) {
            filterConfig.getServletContext().log(sx.getMessage());
        }
        catch(IOException iox) {
            filterConfig.getServletContext().log(iox.getMessage());
        }
    }
    //Clean up resources
    public void destroy() {
    }
}