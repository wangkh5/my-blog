package com.wangkaihua.myblog.controller;

import com.wangkaihua.myblog.common.Result;
import com.wangkaihua.myblog.entity.TbTag;
import com.wangkaihua.myblog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
* @author wangkaihua
* @time  2018/11/24 11:56
*/

@RestController
@RequestMapping("/tag")
public class TagController {

    @Autowired
    private TagService tagService;

    @RequestMapping("/findAll")
    public List<TbTag> findAll(){
        return tagService.findAll();
    }

    @RequestMapping("findOne")
    public TbTag findOne(int id){
        return tagService.findOne(id);
    }

    @RequestMapping("/add")
    public Result add(@RequestBody TbTag tag){
        try {
            tagService.add(tag);
            return Result.successResult();
        }catch (Exception e){
            return  Result.failResult();
        }
    }

    @RequestMapping("/update")
    public Result update(@RequestBody TbTag tag){
        try {
            tagService.update(tag);
            return Result.successResult();
        }catch (Exception e){
            return  Result.failResult();
        }
    }

    @RequestMapping("/delete")
    public Result delete(int [] ids){
        try {
            tagService.delete(ids);
            return Result.successResult();
        }catch (Exception e){
            e.printStackTrace();
            return  Result.failResult();
        }
    }


}
