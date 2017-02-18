var contentReader = angular.module('contentReader', [ 'ngSanitize' ]);

contentReader.service('dataLoaderService', function($http) {
    var dataLoaderService = this;

    dataLoaderService.getUsers = function(onSuccess, onError) {
        $http.get('http://localhost:8080/users').then(onSuccess, onError);
    };

});

contentReader.controller('IndexController', function IndexController(dataLoaderService) {
    var vm = this;
    vm.users = [];
    vm.loadUserData = function() {
        dataLoaderService.getUsers(onSuccess, onError);
    };
    
    function onSuccess(response) {
        vm.users = response.data;
    }
    
    function onError(response) {
        console.log(response);
    }
    
});