/**
 * Created by hua on 2018/9/6.
 */
app.controller('baseController',function ($scope) {
    //分页控件配置，此配置一定要放在控制器中
    $scope.paginationConf = {
        currentPage: 1,
        totalItems: 10,
        itemsPerPage: 1,
        perPageOptions: [10, 20, 30, 40, 50],
        onChange: function(){
            $scope.reloadList();//重新加载
        }
    };

    $scope.reloadList = function () {
        $scope.findPage($scope.paginationConf.currentPage,$scope.paginationConf.itemsPerPage);
    }

    /*批量删除分类*/
    /*被选择的数据项*/
    $scope.selectedIds = [];
    $scope.updateSelection = function ($event,id) {
        /*勾选*/
        if($event.target.checked){
            $scope.selectedIds.push(id);
        }else{/*取消选择*/
            var index = $scope.selectedIds.indexOf(id);
            /*从数组中删除*/
            $scope.selectedIds.splice(index,1);
        }
    }
});