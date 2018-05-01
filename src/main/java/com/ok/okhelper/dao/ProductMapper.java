package com.ok.okhelper.dao;

import com.ok.okhelper.pojo.po.Product;
import com.ok.okhelper.pojo.vo.CategoryVo;
import com.ok.okhelper.pojo.vo.ProductsVo;
import com.ok.okhelper.until.MyMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper extends MyMapper<Product> {
    int cutSalesStock(@Param("salesCount") Integer salesCount,@Param("productId") Long productId);
    
    List<ProductsVo> getProductsList(@Param("condition") String condition,@Param("storeId")Long storeId);
    
    /*
    * @Author zhangxin_an 
    * @Date 2018/4/30 18:09  
    * @Params [cId]  
    * @Return java.util.List<com.ok.okhelper.pojo.vo.ProductsVo>  
    * @Description:通过分类查询商品
    */  
    List<ProductsVo> getProductsListByCategoryId(List<CategoryVo> categoryListTotal);
    
    void updateStatus(Long id);
    
    
}