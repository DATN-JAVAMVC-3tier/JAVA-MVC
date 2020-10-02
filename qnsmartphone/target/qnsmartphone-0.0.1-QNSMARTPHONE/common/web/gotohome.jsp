<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<a href="#top"
	style="z-index: 11000; position: fixed; bottom: 3vh; right: 1vh;"><div
		title="Goto Home" class="the-icons col-md-12 col-sm-12">
		<i class="icon-up-circled-2" style="font-size: 35px; color: #da7227;"></i>
	</div></a>
<script type="text/javascript">
	$("a[href='#top']").click(function() {
		$("html, body").animate({
			scrollTop : 0
		}, "slow");
		return false;
	});
</script>