angular.module('myAutoComplete', [])

.directive('myAutoComplete',['$compile',function($compile) {
	return {
		restrict: 'AE',
		require: 'ngModel',
		scope: true,
		bindToController: {
			ngModel: '='
		},
		controllerAs: 'controller',

		templateUrl: 'js/template.html',

		controller: function($scope, $element, $attrs) {
			var listaNome = ['Allan', 'Julio', 'Fabio', 'Thiago', 'Júlio Michel', 'Fábio Borba', 'Pessoa', 'Pessoa 2']

			
			$scope.$watch('controller.ngModel', function(newValue, oldValue) {
				$scope.lista = [];
				if (newValue == undefined || newValue == '') {
					return;
				}
				angular.forEach(listaNome, function(item){
					var nome = replaceSpecialChars(item);
					var str = replaceSpecialChars(newValue);
					if (nome.indexOf(str) > -1) {
						$scope.lista.push(item);
					}
				})

			})

			function replaceSpecialChars(str) {
				str = str.toLocaleUpperCase()
				str = str.replace(/[ÀÁÂÃÄÅ]/,"A");
				str = str.replace(/[ÈÉÊË]/,"E");
				str = str.replace(/[ÌÍÎ]/,"I");
				str = str.replace(/[ÒÓÔÕ]/,"O");
				str = str.replace(/[ÙÚÜ]/,"U");
				str = str.replace(/[Ç]/,"C");
				
				return str.replace(/[^a-z0-9]/gi,''); 
			}


		}
	}
}])
