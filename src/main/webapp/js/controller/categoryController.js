/*定义控制器*/
app.controller('categoryController',function ($scope,$controller,categoryService) {

    $controller('baseController',{$scope:$scope});//继承

    /*查询所有分类*/
    $scope.findAll = function () {
        categoryService.findAll().success(
            function (response) {
                $scope.list = response;
            }
        );
    }

    /*新增或修改分类*/
    $scope.save = function () {
        /*新增*/
        var object = categoryService.add($scope.entity);
        /*修改*/
        if($scope.entity.id != null){
            object = categoryService.update($scope.entity);
        }
        object.success(
            function (response) {
                if(response.success){
                    $scope.findAll();
                }else{
                    alert(response.message);
                }
            }
        );
    }

    /*根据id查询分类*/
    $scope.findOne = function (id) {
        categoryService.findOne(id).success(
            function (response) {
                $scope.entity = response;
            }
        );
    }


    $scope.delete = function () {
        categoryService.delete($scope.selectedIds).success(
            function (response) {
                if(response.success){
                    $scope.findAll();
                }else {
                    alert(response.message);
                }
            }
        );
    }

});
