app.controller("myCtlr",function($scope){
	
	$scope.companyName="Capgemini India Pvt Ltd";
	
	$scope.myFunc=function(){
		alert('Hello! Welcome To Angular!');
	};
	
	
	
	
});




app.controller('AddOrderController', function($scope) {
    
    $scope.message = 'This is Add new order screen';
     
});
 
 
app.controller('ShowOrdersController', function($scope) {
 
    $scope.message = 'This is Show orders screen';
 
});