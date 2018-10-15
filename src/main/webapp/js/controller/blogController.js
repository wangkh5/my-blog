/**
 * Created by hua on 2018/9/5.
 */
app.controller('blogController',function ($scope,$controller,$location,categoryService,blogService) {

    $controller('baseController',{$scope:$scope});//继承

    $scope.findPage = function (pageNum,pageSize) {
        blogService.findPage(pageNum,pageSize).success(
            function (response) {
                $scope.paginationConf.totalItems = response.totalRecord;
                $scope.list = response.rows;
            }
        );
    }

    /*显示所有分类*/
    $scope.categoryList = [];

    $scope.findAllCategory = function () {
        categoryService.findAll().success(
            function (response) {
                $scope.categoryList = response;
            }
        );
    }

    /*用于后台博文列表显示出分类名称*/
    $scope.categoryNameList = [];
    $scope.initCategoryName = function () {
        categoryService.findAll().success(
            function (response) {
                for(var i = 0;i<response.length;i++){
                    $scope.categoryNameList[response[i].id] = response[i].name;
                }
                console.log($scope.categoryNameList)
            }
        );
    }


    /*添加*/
    $scope.entity = {}
    $scope.add = function () {
        /*ng绑定无效手动赋值*/
        $scope.entity.content = blogEditormd.getMarkdown();
        $scope.entity.contentHtml = blogEditormd.getHTML();
        blogService.add($scope.entity).success(
            function (response) {
                alert(response.message);
            }
        )
    }

    /*$scope.findAll = function () {
        blogService.findAll().success(
            function (response) {
                $scope.list=response;
            }
        );
    }*/

    $scope.delete = function () {
        blogService.delete($scope.selectedIds).success(
            function (response) {
                if(response.success){
                    $scope.reloadList();
                }else{
                    alert(response.message);
                }
            }
        );
    }

    /*博文内容的回显*/
    $scope.findOne = function () {
        /*angular 路由获取参数*/
        var id = $location.search()['id'];
        if(id==null){
            return ;
        }else {
            blogService.findOne(id).success(
                function (response) {
                    $scope.entity = response;
                    blogId = response.id;
                }
            );
        }
    }

    /*博文内容md-->html并显示*/
    $scope.loadEditormdContent = function () {
        $.get("/blog/findBlogToEditormd?id="+$location.search()['id'], function(markdown) {
            editormd.markdownToHTML("editormd-blog-Content", {
                markdown        : markdown ,
                htmlDecode      : "style,script,iframe",  // you can filter tags decode
                // tocm            : true,    // Using [TOCM]
                // tocContainer    : "#custom-toc-container", // 自定义 ToC 容器层
                emoji           : true,
                taskList        : true,
                tex             : true,  // 默认不解析
                flowChart       : true,  // 默认不解析
                sequenceDiagram : true,  // 默认不解析
            });
        });
    }

});
