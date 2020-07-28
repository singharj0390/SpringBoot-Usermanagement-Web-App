$( document ).ready(function(event) {
	$('#countryId').change(function() {
		$("#stateId").find('option').remove();
		$("#cityId").find('option').remove();
		$('<option>').val('').text('-Select-').appendTo("#stateId");
		$('<option>').val('').text('-Select-').appendTo("#cityId");
	    var countryId = $("#countryId").val();
	    $.ajax({
	        type:"GET",
	        url : "getStates?cid="+countryId,
	        success : function(response) {
	        	$.each(response, function(stateId, stateName) {          
	    	             $('<option>').val(stateId).text(stateName).appendTo("#stateId");
	    	    });
	        }
	    });
	   
	});
	
	$("#stateId").change(function(){
		  $("#cityId").find('option').remove();
		  $('<option>').val('').text('-Select-').appendTo("#cityId");
		   var stateId = $("#stateId").val();
		   $.ajax({
			   type:"GET",
			   url:"getCities?sid="+ stateId,
			   success : function(response){
				    $.each(response, function(cityId, cityName){
				    	    $('<option>').val(cityId).text(cityName).appendTo("#cityId");
				    });
			   }
		   });
	});
	
	
});