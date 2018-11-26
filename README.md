# my-blog

## 主要采用的技术
+ 框架：springboot+spring+mybatis
+ 前后端分离开发（页面请参考github上的blog-page 、 blog-admin-page）

## 根据标签进行归档实现思路1
+ 建立标签表
+ 建立标签博客多对多关系表

## 根据标签进行归档实现思路2
+ 建立一张标签表--支持单表的增查
+ 项目引入redis非关系型数据库
+ 对文章和标签的多对多关系存放到redis中
+ 标签主要用途
  - 归档：把每一个标签下的文章列出来（主要包括文章id、标题、时间）
  key= tag:id  value= {id:xxx,title:xxx,time:xxx}
  
  - 查看文章列表、详情：显示出该文章所引用的标签
    blog表新增tags字段 存放标签名称构成的数组

