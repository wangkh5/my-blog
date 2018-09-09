/*定义服务层*/
app.service("categoryService",function ($http) {

    this.findAll = function () {
        return $http.get("/category/findAll");
    }

    this.findOne = function (id) {
        return $http.get("/category/findOne?id="+id);
    }

    this.delete = function (selectedIds) {
        return $http.post("/category/delete",selectedIds);
    }

    this.update = function (entity) {
        return $http.post("/category/update",entity);
    }

    this.add = function (entity) {
        return $http.post("/category/add",entity);
    }

});
