
$('document').ready(function() {
	
	$('.table .btn-primary').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(location, status){
			$('#idEdit').val(location.id);
			$('#ddlCountryEdit').val(location.countryid);
		    $('#addressEdit').val(location.address);
		    $('#detailsEdit').val(location.details);
			$('#cityEdit').val(location.city);
			$('#descriptionEdit').val(location.description);
		});			
		$('#editModal').modal();		
	});
	
	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(location, status){
			$('#idDetails').val(location.id);
			$('#ddlCountryDetails').val(location.countryid);			
			$('#cityDetails').val(location.city);
			$('#descriptionDetails').val(location.description);
			$('#addressDetails').val(location.address);
			$('#detailsDetails').val(location.details);
		});			
		$('#detailsModal').modal();		
	});	
	
	
	
	$('.table #deleteButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#deleteModal #delRef').attr('href', href);
		$('#deleteModal').modal();		
	});	
});