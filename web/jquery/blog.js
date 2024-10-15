function successHandler(data){
		$('#list').empty();
		$.each(data, function(index, blog){
			var html = '<div>';
			html += '<h3>' + blog.title  + '</h3>';
			html += '<div>' + blog.writer  + '</div>';
			html += '<div>' + blog.contents  + '</div>';			
			html += '</div>';			
			
			$('#list').append(html);
		});
	}

$(function(){
	$(window).on('load', function(){
		$.ajax({
			url : 'server.jsp',
			type : 'get',
			dataType : 'json',
			success : successHandler
		});
	});		
});


$(function(){
	$('form').submit(function() {
		$.ajax({
			url : 'server.jsp',
			type : 'post',
			dataType : 'json',
			data : $(this).serialize(),
			success : successHandler
		});
		$('form input').val('');
		
		return false;
	});	
	
	
});






