$(function(){

$("#dateSelection").datepicker({
	
	numberOfMonths:1,
		showWeek:true,
		changeMonth:true,
		changeYear:true,
		showButtonPanel:false,
		minDate: new Date(1970,1 - 1,1),
		maxDate: new Date(2080,12 - 1,31),
		dateFormat:"dd-M-yy"
	});


	
	//$("#dateSelection").datepicker("setDate",new Date());
}

);


$(function(){

	$("#dateSelection1").datepicker({
		
		numberOfMonths:1,
			showWeek:true,
			changeMonth:true,
			changeYear:true,
			showButtonPanel:false,
			minDate: new Date(1970,1 - 1,1),
			maxDate: new Date(2080,12 - 1,31),
			dateFormat:"dd-M-yy"
		});


		
		//$("#dateSelection1").datepicker("setDate",new Date());
	}

	);




