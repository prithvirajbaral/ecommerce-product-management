package com.devcodex.ecom_proj.service;

import com.devcodex.ecom_proj.model.Product;
import com.devcodex.ecom_proj.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProductById(Integer prodId) {
        return repo.findById(prodId).orElse(null);
    }

    public Product addProduct(Product product, MultipartFile imageFile) {
        try {
            product.setImageName(imageFile.getOriginalFilename());
            product.setImageType(imageFile.getContentType());
            product.setImageData(imageFile.getBytes());  // Assuming you have a field `imageData` in Product entity
            return repo.save(product);
        } catch (IOException e) {
            e.printStackTrace();
            // Optionally, you can log this error or rethrow a custom exception
            return null;
        }
    }

    public Product updateProduct(int prodId, Product product, MultipartFile imageFile) throws IOException {
        Product existingProduct = repo.findById(prodId).orElse(null);

        if (existingProduct != null) {
            existingProduct.setName(product.getName());
            existingProduct.setDescription(product.getDescription());
            existingProduct.setBrand(product.getBrand());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setCategory(product.getCategory());
            existingProduct.setReleaseDate(product.getReleaseDate());
            existingProduct.setAvailable(product.isAvailable());
            existingProduct.setQuantity(product.getQuantity());

            // Handle image updates if provided
            if (imageFile != null && !imageFile.isEmpty()) {
                existingProduct.setImageData(imageFile.getBytes());
                existingProduct.setImageName(imageFile.getOriginalFilename());
                existingProduct.setImageType(imageFile.getContentType());
            }

            return repo.save(existingProduct);
        }

        return null; // Product not found
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }

    public List<Product> searchProduct(String keyword) {
        List<Product> products = repo.searchProducts(keyword);
        return products;
    }
}
