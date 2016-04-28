var app=angular.module("myApp",[]);

app.controller("ctrl",function($scope,$http){
	$http.get('http://localhost:8080/Spring_Angular/emp/empContent').
	success(function(data){
		$scope.emp=data;
	});
});

app.controller("myCtrl",function($scope,$http){
	$http.get('http://localhost:8080/Spring_Angular/emp/departContent').
	success(function(data){
		$scope.depart=data;
	});
});