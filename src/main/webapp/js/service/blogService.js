/**
 * Created by hua on 2018/9/5.
 */
app.service('blogService',function ($http) {
    this.add = function (entity) {
        return $http.post("/blog/add",entity);
    }

    this.findAll = function () {
        return $http.get("/blog/findAll");
    }

    this.findPage = function (pageNum,pageSize) {
        return $http.get("/blog/findPage?pageNum="+pageNum+"&pageSize="+pageSize);
    }

    this.delete = function (ids) {
        return $http.get("/blog/delete?ids="+ids);
    }

    this.findOne = function (id) {
        return $http.get("/blog/findOne?id="+id);
    }
})