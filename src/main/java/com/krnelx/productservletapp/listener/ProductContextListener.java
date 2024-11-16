package com.krnelx.productservletapp.listener;

import com.krnelx.productservletapp.repository.ProductRepository;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ProductContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ProductRepository productRepository = new ProductRepository();
        sce.getServletContext().setAttribute("productRepository", productRepository);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {}
}