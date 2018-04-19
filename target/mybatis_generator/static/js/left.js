$(function() {
	$(".book").click(function() {
		if($("span").eq(0).html() == "open") {
			$(".book_div").slideUp();
			$("span").eq(0).html("close");
		} else {
			$(".music_div").slideUp();
			$("span").eq(1).html("close");
			$(".sport_div").slideUp();
			$("span").eq(2).html("close");
			$(".book_div").slideDown();
			$("span").eq(0).html("open");
		}
	})

	$(".music").click(function() {
		if($("span").eq(1).html() == "open") {
			$(".music_div").slideUp();
			$("span").eq(1).html("close");
		} else {
			$(".book_div").slideUp();
			$("span").eq(0).html("close");
			$(".sport_div").slideUp();
			$("span").eq(2).html("close");
			$(".music_div").slideDown();
			$("span").eq(1).html("open");
		}
	})

	$(".sport").click(function() {
		if($("span").eq(2).html() == "open") {
			$(".sport_div").slideUp();
			$("span").eq(2).html("close");
		} else {
			$(".book_div").slideUp();
			$("span").eq(0).html("close");
			$(".music_div").slideUp();
			$("span").eq(1).html("close");
			$(".sport_div").slideDown();
			$("span").eq(2).html("open");
		}
	})

	$("#divFrame_close").click(function() {
		if(window.confirm('是否退出？')) {
			window.close();
		}
	})
})