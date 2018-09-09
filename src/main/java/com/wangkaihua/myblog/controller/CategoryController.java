package com.wangkaihua.myblog.controller;

import com.wangkaihua.myblog.common.Result;
import com.wangkaihua.myblog.entity.TbCategory;
import com.wangkaihua.myblog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangkaihua
 * @create 2018-09-04 16:23
 **/
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/findAll")
    public List<TbCategory> findAll(){
        return categoryService.findAll();
    }

    @RequestMapping("findOne")
    public TbCategory findOne(int id){
        return categoryService.findOne(id);
    }

    @RequestMapping("/add")
    public Result add(@RequestBody TbCategory category){
        try {
            categoryService.add(category);
            return Result.successResult();
        }catch (Exception e){
            return  Result.failResult();
        }
    }

    @RequestMapping("/update")
    public Result update(@RequestBody TbCategory category){
        try {
            categoryService.update(category);
            return Result.successResult();
        }catch (Exception e){
            return  Result.failResult();
        }
    }

    @RequestMapping("/delete")
    public Result delete(@RequestBody int [] ids){
        try {
            categoryService.delete(ids);
            return Result.successResult();
        }catch (Exception e){
            e.printStackTrace();
            return  Result.failResult();
        }
    }


}
