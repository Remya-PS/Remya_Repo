
var app=angular.module("myApp",[]);

app.config(['$routeProvider',
            function($routeProvider) {
          	
              $routeProvider.
                when('/AddNewOrder', {
                  templateUrl: 'add_order.html',
                  controller: 'AddOrderController'
              }).
                when('/ShowOrders', {
                  templateUrl: 'show_orders.html',
                  controller: 'ShowOrdersController'
                })/*.
                otherwise({
                  redirectTo: '/AddNewOrder'
                });*/
          }]);
