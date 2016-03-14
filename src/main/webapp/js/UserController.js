/**
 * Created by zonehy on 2016.3.14.
 */


var app = angular.module('kotlinApp', ['ngRoute']);
app.controller('UserController', function ($scope, $http) {
    $http.post("/kotlin/JsonConverter/toJson")
        .success(function (data) {
            $scope.user = data.data;
        });

});
