<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><dec:title default="Tin tức công nghệ" /></title>
<!--  css riêng  -->
<!--  ebd css riêng  -->
<%@ include file="/common/web/headcss.jsp"%>
</head>
<body>
	<main>
		<div class="container margin_60_35">
			<div class="row">
				<div class="col-md-9">
					<div class="post">
						<a href="blog_post.html"><img src="img/blog-1.jpg" alt="" class="img-responsive">
						</a>
						<div class="post_info clearfix">
							<div class="post-left">
								<ul>
									<li><i class="icon-calendar-empty"></i>12/05/2015 <em>by Mark</em>
									</li>
									<li><i class="icon-inbox-alt"></i><a href="#">Category</a>
									</li>
									<li><i class="icon-tags"></i><a href="#">Works</a>, <a href="#">Personal</a>
									</li>
								</ul>
							</div>
							<div class="post-right"><i class="icon-comment"></i><a href="#">25 </a>
							</div>
						</div>
						<h2>Duis aute irure dolor in reprehenderit</h2>
						<p>
							Ludus albucius adversarium eam eu. Sit eu reque tation aliquip. Quo no dolorum albucius lucilius, hinc eligendi ut sed. Ex nam quot ferri suscipit, mea ne legere alterum repudiandae. Ei pri quaerendum intellegebat, ut vel consequuntur voluptatibus. Et volumus sententiae adversarium duo......
						</p>
						<p>
							Ludus albucius adversarium eam eu. Sit eu reque tation aliquip. Quo no dolorum albucius lucilius, hinc eligendi ut sed. Ex nam quot ferri suscipit, mea ne legere alterum repudiandae. Ei pri quaerendum intellegebat, ut vel consequuntur voluptatibus. Et volumus sententiae adversarium duo......
						</p>
						<a href="blog_post.html" class="btn_1">Read more</a>
					</div><!-- end post -->

					<div class="post">
						<a href="blog_post.html"><img src="img/blog-2.jpg" alt="" class="img-responsive">
						</a>
						<div class="post_info clearfix">
							<div class="post-left">
								<ul>
									<li><i class="icon-calendar-empty"></i>12/05/2015 <em>by Mark</em>
									</li>
									<li><i class="icon-inbox-alt"></i><a href="#">Category</a>
									</li>
									<li><i class="icon-tags"></i><a href="#">Works</a>, <a href="#">Personal</a>
									</li>
								</ul>
							</div>
							<div class="post-right"><i class="icon-comment"></i><a href="#">25 </a>
							</div>
						</div>
						<h2>Duis aute irure dolor in reprehenderit</h2>
						<p>
							Ludus albucius adversarium eam eu. Sit eu reque tation aliquip. Quo no dolorum albucius lucilius, hinc eligendi ut sed. Ex nam quot ferri suscipit, mea ne legere alterum repudiandae. Ei pri quaerendum intellegebat, ut vel consequuntur voluptatibus. Et volumus sententiae adversarium duo......
						</p>
						<p>
							Ludus albucius adversarium eam eu. Sit eu reque tation aliquip. Quo no dolorum albucius lucilius, hinc eligendi ut sed. Ex nam quot ferri suscipit, mea ne legere alterum repudiandae. Ei pri quaerendum intellegebat, ut vel consequuntur voluptatibus. Et volumus sententiae adversarium duo......
						</p>
						<a href="blog_post.html" class="btn_1">Read more</a>
					</div><!-- end post -->

					<div class="post">
						<a href="blog_post.html"><img src="img/blog-3.jpg" alt="" class="img-responsive">
						</a>
						<div class="post_info clearfix">
							<div class="post-left">
								<ul>
									<li><i class="icon-calendar-empty"></i>12/05/2015 <em>by Mark</em>
									</li>
									<li><i class="icon-inbox-alt"></i><a href="#">Category</a>
									</li>
									<li><i class="icon-tags"></i><a href="#">Works</a>, <a href="#">Personal</a>
									</li>
								</ul>
							</div>
							<div class="post-right"><i class="icon-comment"></i><a href="#">25 </a>
							</div>
						</div>
						<h2>Duis aute irure dolor in reprehenderit</h2>
						<p>
							Ludus albucius adversarium eam eu. Sit eu reque tation aliquip. Quo no dolorum albucius lucilius, hinc eligendi ut sed. Ex nam quot ferri suscipit, mea ne legere alterum repudiandae. Ei pri quaerendum intellegebat, ut vel consequuntur voluptatibus. Et volumus sententiae adversarium duo......
						</p>
						<p>
							Ludus albucius adversarium eam eu. Sit eu reque tation aliquip. Quo no dolorum albucius lucilius, hinc eligendi ut sed. Ex nam quot ferri suscipit, mea ne legere alterum repudiandae. Ei pri quaerendum intellegebat, ut vel consequuntur voluptatibus. Et volumus sententiae adversarium duo......
						</p>
						<a href="blog_post.html" class="btn_1">Read more</a>
					</div><!-- end post -->

					<div class="text-center">
						<ul class="pager">
							<li class="previous"><a href="#"><span aria-hidden="true">&larr;</span> Older</a>
							</li>
							<li class="next"><a href="#">Newer <span aria-hidden="true">&rarr;</span></a>
							</li>
						</ul>
					</div>
				</div><!-- End col-md-9-->

				<aside class="col-md-3" id="sidebar">

					<div class="widget">
						<div id="custom-search-input-blog">
							<div class="input-group col-md-12">
								<input type="text" class="form-control input-lg" placeholder="Search">
								<span class="input-group-btn">
                            <button class="btn btn-info btn-lg" type="button">
                                <i class="icon-search-1"></i>
                            </button>
                        </span>
							</div>
						</div>
					</div><!-- End Search -->
					<hr>
					<div class="widget">
						<h4>Categories</h4>
						<ul id="cat_nav_blog">
							<li><a href="#">News</a>
							</li>
							<li><a href="#">Events</a>
							</li>
							<li><a href="#">SEO principles</a>
							</li>
							<li><a href="#">SEO best practice</a>
							</li>
						</ul>
					</div><!-- End widget -->
					<hr>
					<div class="widget">
						<h4>Recent post</h4>
						<ul class="recent_post">
							<li>
								<i class="icon-calendar-empty"></i> 16th July, 2020
								<div><a href="#">It is a long established fact that a reader will be distracted </a>
								</div>
							</li>
							<li>
								<i class="icon-calendar-empty"></i> 16th July, 2020
								<div><a href="#">It is a long established fact that a reader will be distracted </a>
								</div>
							</li>
							<li>
								<i class="icon-calendar-empty"></i> 16th July, 2020
								<div><a href="#">It is a long established fact that a reader will be distracted </a>
								</div>
							</li>
						</ul>
					</div><!-- End widget -->
					<hr>
					<div class="widget tags">
						<h4>Tags</h4>
						<a href="#">Lorem ipsum</a>
						<a href="#">Dolor</a>
						<a href="#">Long established</a>
						<a href="#">Sit amet</a>
						<a href="#">Latin words</a>
						<a href="#">Excepteur sint</a>
					</div><!-- End widget -->

				</aside><!-- End aside -->
			</div>
		</div>
    </main><!--/main-->
    
    <div id="newsletter_container">
		<div class="container margin_60">
			<div class="row">
				<div class="col-md-8 col-md-offset-2 text-center">
					<h3>Subscribe to our Newsletter for latest news.</h3>
					<div id="message-newsletter_2"></div>
					<form method="post" action="assets/newsletter.php" name="newsletter_2" id="newsletter_2" class="form-inline">
						<input name="email_newsletter_2" id="email_newsletter_2" type="email" value="" placeholder="Your Email" class="form-control">
						<button id="submit-newsletter_2" class="button">Subscribe</button>
					</form>
				</div>
			</div>
		</div>
	</div><!-- /newsletter_container -->
	<!--  include footer -->

</body>
</html>