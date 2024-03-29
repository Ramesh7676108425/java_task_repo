<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
		integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
		integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
		crossorigin="anonymous"></script>
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
		crossorigin="anonymous">

	<!-- <link rel="icon" type="image/x-icon"
	href="https://www.x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"> -->
	<link rel="icon" type="logo/jpeg"
		href="data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBwgHBgkIBwgKCgkLDRYPDQwMDRsUFRAWIB0iIiAdHx8kKDQsJCYxJx8fLT0tMTU3Ojo6Iys/RD84QzQ5OjcBCgoKDQwNGg8PGjclHyU3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3N//AABEIAMAAzAMBEQACEQEDEQH/xAAcAAEAAQUBAQAAAAAAAAAAAAAAAQQFBgcIAwL/xABNEAABAwMBBAUGCQcJCQEAAAABAAIDBAURBgcSITETQVFhcRQiUoGRoSMyQmJyscHC0TZTVXSUs9IVFzM0N0OCorIkJ2Nkc5Lh8PEl/8QAGwEBAAMBAQEBAAAAAAAAAAAAAAIDBAEFBgf/xAA3EQEAAgECAwUFBQgDAQAAAAAAAQIDBBESITEFEzJBUQYUIlJhcZGhwdEVM0KBgrHh8DQ1QyP/2gAMAwEAAhEDEQA/AN4oCAgICAgICCCcILNddVWS0g+XXKBjhzYHbzvYF2K2lybRDE7htdskAIpIKqpPaGho96sjDaUJyRCx1O2acn/ZrRGB1F8pz9Sl3P1RnL9FG7bJds+bbqUDvJXe5j1c72fR6R7ZriCOltdM4dzyE7mPKTvZ84XOk2z0xI8stUzO0xSB2PauThn1djN9GSWzaZpmvcGGtNO89U7d0e1VzjtCcXiWV0tbT1kQlpZ4po/SjeHBQmJhLeJe4OUdSgICAgICAgICAgICAgIPiV7Y2l73BrWjJJOAEGA6m2o2u178Ftb/AChUt62nEbT9LrVlccz1V2yRHRq++651BfC5tRXOhgP9zT+Y0eOOJ9avrjrCqb2ljRJccuJJPWVNFHejiEEda6I61wEHyuirt9yrrbKJrfVz00g5OieWqMxEkTMNg6b2vXCmc2G+wNq4uRmjAa8d5HI+5VWxR5La5fVtbT+pbXqCnE1tq2yelGeD2+IVNqzHVdFonovIKi6lAQEBAQEBAQEBAQWPU+prdpyk6evl84j4OFnF8h7h9qlWs2nkja2zR2q9cXbUcj2vf5PQ58ymiOBj5x+UfctNaRCmb2li6mghAQQjj7ZDLLjo2OI7eQVeTLjxx8VtmrT6LUan9zSZ/ly+99+RT/mx7VR77p99uJvnsDtKI37qfvh4yRvZ8dhb3kLRTJS/hmJebn02bTztlpMfbD4U1CCghBBQe9FW1NBO2ooqiSCZpy18ZwQubbkTs29oXaoyreyg1JuxTcAyrbwY/wCkOo9/LwVF8XnC+uTyltWN7Xta5jg5rhkOHIqla+0BAQEBAQEBBBOEGJa71pSaYpCxoE1wkHwMPUPnO7vrU6UmyNrcLQt2ulZd619ZcJnSzv5kngB2DsC1ViIjZmmZnnKiXQQQUcRzQXCkoflz9XJi8fV6/wDgx/f+j7XsX2diaxn1cdelf1/RXgAABowB1LybWm07zL7SmOtIiKxtCVxY+HNa8YcAR2FSre1J3rOynNgx5qTXJXePqtdbRdEC+EEs6x1he3o9b3nwZOr4Ltz2fnSxOfT86ecen+P7KJelG+3N8qgoIQQgINgbPNotRYpGW+7udPbSQ1r+boPxb3f/AA1Xx784WUybcpb3paiKphjmgkbJE9u8xzTkEHrWZoe6AgICAgIIPBBjWuNVU+mLUZ5PhKmU7tPCPlu7T2AfgOtSpWbSja3DDnu519Tc66WsrZTLNK7Jcfq8FriNmeZmVKuuIQQUEIKihh6aYEjzW8Sseuzd1imI6zye57PaCNXrYm0fDTnP5fivAXzj9O2OXNdiJnoTaI5y8fKYM46ZmfpBXe7Ztt+GWCe1tBF+Dvq7/bD0zkZHJUzy6vQrMWjeEEA8CMjrSJmOjl6xaOG3SVjq4uhqHsHLmF9Npc3e4ovL8m7W0Xuervijp1j7JeK0PNQggoCCEGw9l2uzY6llpukpNumfiOQ8fJ3H7ufYqslOLnC2l9uUt8scHDOQfArMvfaAgICAgo7lWwUFFNV1LwyGFhe5x7AuxG87G+3Nzfqq/wA+pLxLXz5DPiQRn5DP/PMrXWvDGzLM8U7rOpOIQQUEI4ILjaWjo5Hde9j3Lxe1LTx1h957IUjuMtvObbfdEfqr15T7BTimnud1o7VS4ElVI2ME8hk8SfAAlez2firFZyy+G9qdZknJXSVnaNt5+vp/Jtb+Z+xmg6IVNV5Xu/0+/wAM457vLHctvfWieT5PuoanbDPb7jWW2p4yU0rmHxBwcdyw9pYa8MZYfX+yetvx30tp5Rzj6Kjgea8d9utd3A343dvAr2+y5+C0fV8D7YY4jPit9J/Bb16kPkBBBQQgII6uPJBu/Y7q83Gj/kSvlLqulZmFzjxkj5e0clny025wvx335NoA5VK1KAgIIccBBp7bPqNz5orBTOw1oE1Vg8/Rb9p9Svw185U5Z8oatV6pCCCghHBBCC4Wp4zJH1/G8V5HalJ+G/l0faeyGojfLh8+U/lP5LivHfcqrR5/3iWMf8b7j17uh/40/wC+j849pf8As/6Y/N0XjCm8VzrrqHybaPd2Dg10of8A9zGO+1c1kcWl+x63s7fg7TrHrEqHqK8B+lxK03VwM7Wj5I4r3uzKTGKZ9X5z7WZ4yaytI/hj+/NRL0XzBnCCEEIIQEFTa7hUWi409woXbs9O/fZn5Xa09xGR60mN4didpdSaeu1PerTS3GkPwVRGHtHW3tafA8FimNpaoneN1zXHRAQUN4r4rbb6irmOI4Yy93qCRzknlDmG6V0tyuFRXVDi6SeQvPr6ltiNoZJneVNldEFBCOCCEBB9QyGKZsg6jx7wqs2KMuOaT/stmh1l9HqK56+X4x6L5G8SM3mkEL5nJjtjtNbP1jTarHqcUZcU7xKs0f8A2jWP/rH/AEPXs6L/AI0/b+j4H2l/7P8Apj83RpVjxWg9rkXQbRi/qnpIX+vz2/dCllrxaa0NnZV+DtHDb6sdqJmwRl7/AFDtK8LBhtmvw1fo3aPaGPQaect+vlHrPoskji95e7m45X09KxSsVr0h+TZ818+S2W/W07vhSVIPNBCAghBCAUG3Nhd9cPK7HPJwB6eAHv8AjD6iqM1fNdinybkacjKoXJQCg1rtouppbDHQRuw+sl3XY9BvE/YPWrcMbyqyzyaTWlShHBAKCEBBCAg9KeokgdlhyDzaVRn0uPPG09fV6PZ3amo0F98U7xPWJ6SyHQk/lG0Cxybu78ORjPzHqvDgnDhmsyt7S7QjtDVRmivDy226ukzwUGVpLbvGYdR2iqaOL6Vzc9R3H5++rsdYvSayhGScWWuWvWObWk00kzsyHP2KeLDTFG1YS1muz6zJ3ma28/hH2PNWsgSghBCCEBBCCOaC76RujrLqW31wdhjJgyTjzY44P159SjeN6pVnaXU0Dw5gI5FY2p6oPl5wEGhdsleanVgpAcso6doPH5bvOPu3VpwxtXdnyTz2YIrVYUEICCEBBCAghBkWzn8vLIP+YP7tyhk8Ep4/E6YWRpak2/Qf7PZKnGd2WWIn6TQ77ivwecKcsct2nsq9SjKAghAQQghAQQg+XDeaWnrGEHUGgbkbrpO1Vjjl8lO0SH57fNd7wVjvG1pa6zvVkii685jhhKDmbW9R5TrG8zZzmqcwf4AGfdWynhhlvO9lkUkRAQQgIIQEBBCDI9nH5eWT9YP7tyhk8Ep4/E6XWRpW692K2X2GGG7UrKmOGTpGNfyDsEZ9hK7EzHRyYiVnuWz7S1xi6OS0wxOxwfB5jh6wpd5aPNGaV9GEXrYuSHPsd149UVW3I8N5vEesFWVzesITi9GB3nRGpbNvGttE7oh/fU3wrPHLeI9YCti9ZQmkwx08HY5EcweakghAQQghAKCOaDfWw+q6XRwgz/VquWPHiQ/76zZY2s0453q2SFUm8an4qDli8v37zcXniXVcp/zlbY6Qxz1lRroICAghAQQThB7SUdZFSNrJaKqjpHHAqHQPEXd55GPeubw7tLxXXGRbOPy9sn6wf3blDJ4JTx+J0wsjSlAQEBBY75pWx3xjm3G3QSPP961ga8d+RxUotMdHJrE9XOusrCdNamrLWHF8UW66Fx5ujcMjPeOXqWqtuKN2a0cM7LIpIiCEEICT0G6Ngsn/AORc4/RrAfawfgs+fxL8XRtoclSteNV8QoOV7sNy7VzPRqpR/nK2x0hjnrKlXRCAgICCEGS7OKKkuGtbdTV7GvhLnO3HDIcWtJAPrAUMkzFUqRvZ0jLFHLC6KVjXxuaWuY4ZBB6sdiyNTnraTo12l7n5RRxuNqqHfBOxwid6BP1LVjvxR9WfJTbnCg2cfl5ZP1g/u3LuTwS5j8TplZGkQEBAQEHO+2o/7wJ/1SH7y1YvCoy9YYMrVSFwEEIC6Nz7Bm4td0d21bR7GD8VmzdV+Lo22OSpWvKpGWIOYtYQim1Zd4eWKt7h4O84e5wWynhhltHxLQpIiAghAQEFVaLjJaLrSXCHO/TStkAHX2rlo3jZ2s7Tu6poKuKuooKuncHRTMD2kHPAhYpjZrjmiuo6evpZaWtgjnglaWvjkbvNcPBdidugxi1bNtOWi9xXWggqI5YSXRxmcujaSCMgHjyJ61KclpjZCKRE7wy9QTSgICAgIOdttP8AaBU/qkP3lqxeFRl6wwZWqhcEICB3IQ3psNp+j0pJPj+sVsjvUA1v1tKzZp3s0Y42q2eFUsecwyw4Qc9bWqHyPWEkwbhtXCyXPzmjcPua32rVinlsz5I5sNVisQEBBCAgFBuPYjqYTU0mnat46SHMtISfjR/Kb/hPHwPcs+WvmvxW3jZtjKpWpQEBAQEBAQc7bafy/qe+kh+8tWLwqMvWGDK1UhcBAQQTujJ5BdHSmzS3m3aPtVO5pa/oRI8H0nkud73FYrzvaWqvRmCikhw4INS7bbWZbbSXFjcuppdx5+Y/h9YarsM89lWaOW7Ty0KBAQEBBCAg97fWz22vp66if0dRTyCSN3ePsIyD3FcmN+UuxMxO8OmdIakpdT2aG4Up3XnzZojzjf1j8FktWazs1VmLRvC+qLogICAgIIyg5g2iXZl61rdK2Eh0AkEMR7WsG7n1kE+BWykbV2ZbzvbkxxSREBAQV9itzrveaK3tbkTzNa76Ocu9wK5ado3drG8uqLfGI4WgcAAAAsTX9FYgILDqq1x3a1VVFIOE0ZbnsOOBXaztO7kxvGzmSoglpaiWnnaWyxPLHg8OI4LZDJMc3wuiEBAQMoGUEIL/AKK1TVaTvLauAOkppMNqacH+kb3fOHUVG9ItCdLcMukLPd6K82+Cvt8wlp527zXciO4jqI7FkmJhoid1dlcdM+CBkdyBkdyBkdqDBdrGqxp6wupqWTFwrgY4sc2N+U/7PEqzHXilC9toc78PHxWpmEBAQEGy9itlM9xqbvKw7kA6GIkfKPE49WFTmt5LcUebekLd1gCzr3ogIPKePfaR3IND7X7CaG7Mu8LD5PVeZMR8mQcifpD/AErRity2lRlrz3hr/KuVIygZQMoCCEEoPSKCSVx3cAN5uPIKnNnpij4uvp5t2i7Oz620xjjlHWZ6R9s/krLdBV9E91LXT0zS8giKZ7Q49uGkLPqdbXBaK2rzmN3m5c/c3mkc9lV0Nz/TNb+0y/xLP+1cfyq/fp9EGG6fpmt/aZf4k/amL5T36fQ6G6fpmt/aZf4k/amP5T36fRHQ3T9M1v7TL/En7Vx/Ke/T6HQ3T9M1v7RL/En7Ux/Ke/T6LdcoqiOVrqupkqCRgPke5xx6ytum1Nc9ZmsdFlM3exuo1qWC4CAg+4IJqqaOnpWGSaV4ZG0dbicBJnZ2I3l0zoyxR2Oy01DHxMTfPfj47zxcfasdrcUtVY2jZkw5KLqUBBBGQgsGqLNT3e2VFFVRgxStI8D1H1HiuxO07uTG8ObrzbKizXKa31bSJYTje9JvUR4rZWd4ZrV2lRLqIghAQEFTR0pqHbxyIxzPb4LJqtVGGNo52nye52N2NftC/HbljjrPr9I/N9VlSC3oYP6MdnWq9Lp7V/8Ark52n8F3a/alL19z0fw4q+nn/j+6otdXBDC6KR26d7IyOYWfX6XJfJxY45PkNThte0TCt8upfzrFh9z1Pyyz+73+U8upPzzF33PU/LJ3F/RHl1J+eYuTo9T8sncX9Dy6k/PMXPc9T8sncX9EeXUn55ie56n5ZO4v6LXdalk8rREQQ0c+1exocF8OOePrLbpsc0rzUK3tAuAgckG1NkOlXPkF/rYznBbShw6uRf8AYFRlv5Qux185bpp49xgHcqFz2QEBAQecrN9pBQa72kaNbfaLp6UBlwpx8E7kJB1sP49SnS/DKF6cTRczJIZXxTRmORjt17HDBaewrXE782bpO0vhA4oKuOhklhEgc0ZHAdqxZNfjx5OCX0Gl9m9VqdN39ZiN+kec/o8qandNPuYwG/H7lZqNTXFj4/Xoydl9l5Ndqpw9Ir4p9P8AfJcZI5qqop7ZbonSVE7gxkbOZ7vx7lh0WGbWnNl/k+g9oNdXT4o7P0vKPPb+38/P7mVN2T3IbkMt4tcVc9uRSOeS7wXo97Ho+P7qVJpDRNRNrIW2+R07GUbg6opppMdOxwcBuEc+IzwUr5Ph5OUpz2l6bTNHMs91lqLUKVlHNJHFDRQv3pWuLR8k8eJz7VzHffqXx7dH1TbKbq6GIV1zttFVzN3o6SV5Lyk5vSHe6n1WGPR11Oqo9Nztjp66Qncc85YWhpOQesHBUuOOHdyKTvsuF62d3Oy2ivuVwq6RjaVwa2IE70/EDLc9XFcrliZ2LUmI33Yb4q1WIC4CAgynQmkptSXAPma5luhcOleOBefQb9p6vFV5L7RyWY6bzvLom20UdNCxkcbWMY3da1vJoHIBZWhcAglAQEBAQU88AkB4DKDWO0XQQuwfXW4NjuDRxGcNnHYew9hVlLzXr0V3pFmmJ4pIJnwzxvjlYcPY8YLStUTv0Z+nJ8IK+1zkSdE5xwfi56ivN7RwRNO8iOcPrPZbtK2PP7refht0+k/5VtQ9lNE94A3ne8rzMFL6i9aTPKPwh9X2hnwdl6fJnpWItb8ZXzYy6J20GB1SRvmmm6LPp8OXfu7y9+9Yrj2jo/L4yWyZJved5nmtuqm3D+cyqDek/lI3Bnk4473MbmO7H296nWY4ELcXG2VrUwfzuaP3N3pwJOkxzA3Tu596qp+7lbPiWG6tp/5/4vKcYMkJZnt6EY96lH7pD/0VGvKvSMWvHC82y/TXhphML6eVoY4YG7uAvHDPv3lykWmn0Tm0b9FyrLgbhtX0s+W2VlBKynna5tWGbz27rt0jdcfnc1yI2pPM33t0a+2r1c9Vrq5RzSOcyBzYo254Nbug8vWrMcRwqbzMzsxFWICAgIMk0dpCs1PVb2HQ0DDiWfHxvmt7T9X1wvkiqdKTLoKwWamtdHDS0kIihiGGMH/vNZZmZ5y0xG0L40YC4JQEBAQEBAKCnngEjSCAUGB620JS32MyA+T1rRhlQ1nucOse9Tpeao2pFmlL1Y7lYqkwXKDcPyZG8Y394P2HBWmLRPRntWYlb43lj2uHNvJL1i9ZrPmliyWx3i9eUxtsmeofOQXnlyHYoYcNMMbUhp1naGo1t+PNbf0jyh9UlVPRVUNVSSuhqIXh8cjTgtPardmLeWdN2tXvcbJLbbXJVsbuiqdCd7x5qruarO9libtRXSTUEd+lqTJcI5BI1725HDqx1DBIx3qzhiI2R4533XbVWu6/UrKfyiio6WenkEjainDhISBw4k8OajXHFUrZJlc4Nq96ZBGKqhttXUxNwyqliO+O/h1qM4Yl3vJ2WCLWF3bqiPUc0rKivZnd6RvmAEFu6ADwGCVOaRw8KPHO+63Xy6T3u7VNzq2xtnqXBzxGMNHDHD2LsRtGyMzvO6hXXBBIBJAAJJ4AAccoM+0bs3qrlIyrvjXQUowW03y5PpeiO7n4Km+XyhbXH6t2Wm1wUUDIYYmxxtG61jRgALOvXZjd0IPpAQEBAQEBAQEHnJGHtwUFmu9kp66nfDURMlieMOY9uQkTt0cmN2qdS7K3sc+axTBpPHyacnGfmv6vWr65p/iVWx894a8uVruFpl6O50U9M7qMjfNPg4cD6irotE9Fc1mOqjUkULgLoICAuAgkZLgxoJceQHMp0GUWDQV9u72vfTGipzzlqBhxHzWc/bhV2yxCyMcy2tpPQFtsYEkcJnqscZ5eLvV1AeCotebLq0iGcU9G2LqUElW0bqCUBAQEBAQEBAQEBBBAPMIPCWma8cggttdaIp2OZJGx7DzY8ZB9RTmMNvGzOyVhc5tK6neeO9A7d4+HJTjJaEJpEsTr9kszSTRXTh6M8WSfWCFZGb6I91CzVGzTUMTvgvJJR2iUtPvClGWqE4p9VK7Z9qUH+pRu8Jxhd72jndS+49nepXnBpqZn0p/wBTvauxilcaXZXd5COnraWEdYY1z/AMFHvo8oSjF6sjtuyWgY4GtqKmo7Wg7gPsUZzW8koxQzOy6Ptlqx5FQwQu9INy7281XNrT1lOIiGRQUDGY4KLqrZG1vIIPRAQEBAQEBB/9k=">

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBwgHBgkIBwgKCgkLDRYPDQwMDRsUFRAWIB0iIiAdHx8kKDQsJCYxJx8fLT0tMTU3Ojo6Iys/RD84QzQ5OjcBCgoKDQwNGg8PGjclHyU3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3N//AABEIAMAAzAMBEQACEQEDEQH/xAAcAAEAAQUBAQAAAAAAAAAAAAAAAQQFBgcIAwL/xABNEAABAwMBBAUGCQcJCQEAAAABAAIDBAURBgcSITETQVFhcRQiUoGRoSMyQmJyscHC0TZTVXSUs9IVFzM0N0OCorIkJ2Nkc5Lh8PEl/8QAGwEBAAMBAQEBAAAAAAAAAAAAAAIDBAEFBgf/xAA3EQEAAgECAwUFBQgDAQAAAAAAAQIDBBESITEFEzJBUQYUIlJhcZGhwdEVM0KBgrHh8DQ1QyP/2gAMAwEAAhEDEQA/AN4oCAgICAgICCCcILNddVWS0g+XXKBjhzYHbzvYF2K2lybRDE7htdskAIpIKqpPaGho96sjDaUJyRCx1O2acn/ZrRGB1F8pz9Sl3P1RnL9FG7bJds+bbqUDvJXe5j1c72fR6R7ZriCOltdM4dzyE7mPKTvZ84XOk2z0xI8stUzO0xSB2PauThn1djN9GSWzaZpmvcGGtNO89U7d0e1VzjtCcXiWV0tbT1kQlpZ4po/SjeHBQmJhLeJe4OUdSgICAgICAgICAgICAgIPiV7Y2l73BrWjJJOAEGA6m2o2u178Ftb/AChUt62nEbT9LrVlccz1V2yRHRq++651BfC5tRXOhgP9zT+Y0eOOJ9avrjrCqb2ljRJccuJJPWVNFHejiEEda6I61wEHyuirt9yrrbKJrfVz00g5OieWqMxEkTMNg6b2vXCmc2G+wNq4uRmjAa8d5HI+5VWxR5La5fVtbT+pbXqCnE1tq2yelGeD2+IVNqzHVdFonovIKi6lAQEBAQEBAQEBAQWPU+prdpyk6evl84j4OFnF8h7h9qlWs2nkja2zR2q9cXbUcj2vf5PQ58ymiOBj5x+UfctNaRCmb2li6mghAQQjj7ZDLLjo2OI7eQVeTLjxx8VtmrT6LUan9zSZ/ly+99+RT/mx7VR77p99uJvnsDtKI37qfvh4yRvZ8dhb3kLRTJS/hmJebn02bTztlpMfbD4U1CCghBBQe9FW1NBO2ooqiSCZpy18ZwQubbkTs29oXaoyreyg1JuxTcAyrbwY/wCkOo9/LwVF8XnC+uTyltWN7Xta5jg5rhkOHIqla+0BAQEBAQEBBBOEGJa71pSaYpCxoE1wkHwMPUPnO7vrU6UmyNrcLQt2ulZd619ZcJnSzv5kngB2DsC1ViIjZmmZnnKiXQQQUcRzQXCkoflz9XJi8fV6/wDgx/f+j7XsX2diaxn1cdelf1/RXgAABowB1LybWm07zL7SmOtIiKxtCVxY+HNa8YcAR2FSre1J3rOynNgx5qTXJXePqtdbRdEC+EEs6x1he3o9b3nwZOr4Ltz2fnSxOfT86ecen+P7KJelG+3N8qgoIQQgINgbPNotRYpGW+7udPbSQ1r+boPxb3f/AA1Xx784WUybcpb3paiKphjmgkbJE9u8xzTkEHrWZoe6AgICAgIIPBBjWuNVU+mLUZ5PhKmU7tPCPlu7T2AfgOtSpWbSja3DDnu519Tc66WsrZTLNK7Jcfq8FriNmeZmVKuuIQQUEIKihh6aYEjzW8Sseuzd1imI6zye57PaCNXrYm0fDTnP5fivAXzj9O2OXNdiJnoTaI5y8fKYM46ZmfpBXe7Ztt+GWCe1tBF+Dvq7/bD0zkZHJUzy6vQrMWjeEEA8CMjrSJmOjl6xaOG3SVjq4uhqHsHLmF9Npc3e4ovL8m7W0Xuervijp1j7JeK0PNQggoCCEGw9l2uzY6llpukpNumfiOQ8fJ3H7ufYqslOLnC2l9uUt8scHDOQfArMvfaAgICAgo7lWwUFFNV1LwyGFhe5x7AuxG87G+3Nzfqq/wA+pLxLXz5DPiQRn5DP/PMrXWvDGzLM8U7rOpOIQQUEI4ILjaWjo5Hde9j3Lxe1LTx1h957IUjuMtvObbfdEfqr15T7BTimnud1o7VS4ElVI2ME8hk8SfAAlez2firFZyy+G9qdZknJXSVnaNt5+vp/Jtb+Z+xmg6IVNV5Xu/0+/wAM457vLHctvfWieT5PuoanbDPb7jWW2p4yU0rmHxBwcdyw9pYa8MZYfX+yetvx30tp5Rzj6Kjgea8d9utd3A343dvAr2+y5+C0fV8D7YY4jPit9J/Bb16kPkBBBQQgII6uPJBu/Y7q83Gj/kSvlLqulZmFzjxkj5e0clny025wvx335NoA5VK1KAgIIccBBp7bPqNz5orBTOw1oE1Vg8/Rb9p9Svw185U5Z8oatV6pCCCghHBBCC4Wp4zJH1/G8V5HalJ+G/l0faeyGojfLh8+U/lP5LivHfcqrR5/3iWMf8b7j17uh/40/wC+j849pf8As/6Y/N0XjCm8VzrrqHybaPd2Dg10of8A9zGO+1c1kcWl+x63s7fg7TrHrEqHqK8B+lxK03VwM7Wj5I4r3uzKTGKZ9X5z7WZ4yaytI/hj+/NRL0XzBnCCEEIIQEFTa7hUWi409woXbs9O/fZn5Xa09xGR60mN4didpdSaeu1PerTS3GkPwVRGHtHW3tafA8FimNpaoneN1zXHRAQUN4r4rbb6irmOI4Yy93qCRzknlDmG6V0tyuFRXVDi6SeQvPr6ltiNoZJneVNldEFBCOCCEBB9QyGKZsg6jx7wqs2KMuOaT/stmh1l9HqK56+X4x6L5G8SM3mkEL5nJjtjtNbP1jTarHqcUZcU7xKs0f8A2jWP/rH/AEPXs6L/AI0/b+j4H2l/7P8Apj83RpVjxWg9rkXQbRi/qnpIX+vz2/dCllrxaa0NnZV+DtHDb6sdqJmwRl7/AFDtK8LBhtmvw1fo3aPaGPQaect+vlHrPoskji95e7m45X09KxSsVr0h+TZ818+S2W/W07vhSVIPNBCAghBCAUG3Nhd9cPK7HPJwB6eAHv8AjD6iqM1fNdinybkacjKoXJQCg1rtouppbDHQRuw+sl3XY9BvE/YPWrcMbyqyzyaTWlShHBAKCEBBCAg9KeokgdlhyDzaVRn0uPPG09fV6PZ3amo0F98U7xPWJ6SyHQk/lG0Cxybu78ORjPzHqvDgnDhmsyt7S7QjtDVRmivDy226ukzwUGVpLbvGYdR2iqaOL6Vzc9R3H5++rsdYvSayhGScWWuWvWObWk00kzsyHP2KeLDTFG1YS1muz6zJ3ma28/hH2PNWsgSghBCCEBBCCOaC76RujrLqW31wdhjJgyTjzY44P159SjeN6pVnaXU0Dw5gI5FY2p6oPl5wEGhdsleanVgpAcso6doPH5bvOPu3VpwxtXdnyTz2YIrVYUEICCEBBCAghBkWzn8vLIP+YP7tyhk8Ep4/E6YWRpak2/Qf7PZKnGd2WWIn6TQ77ivwecKcsct2nsq9SjKAghAQQghAQQg+XDeaWnrGEHUGgbkbrpO1Vjjl8lO0SH57fNd7wVjvG1pa6zvVkii685jhhKDmbW9R5TrG8zZzmqcwf4AGfdWynhhlvO9lkUkRAQQgIIQEBBCDI9nH5eWT9YP7tyhk8Ep4/E6XWRpW692K2X2GGG7UrKmOGTpGNfyDsEZ9hK7EzHRyYiVnuWz7S1xi6OS0wxOxwfB5jh6wpd5aPNGaV9GEXrYuSHPsd149UVW3I8N5vEesFWVzesITi9GB3nRGpbNvGttE7oh/fU3wrPHLeI9YCti9ZQmkwx08HY5EcweakghAQQghAKCOaDfWw+q6XRwgz/VquWPHiQ/76zZY2s0453q2SFUm8an4qDli8v37zcXniXVcp/zlbY6Qxz1lRroICAghAQQThB7SUdZFSNrJaKqjpHHAqHQPEXd55GPeubw7tLxXXGRbOPy9sn6wf3blDJ4JTx+J0wsjSlAQEBBY75pWx3xjm3G3QSPP961ga8d+RxUotMdHJrE9XOusrCdNamrLWHF8UW66Fx5ujcMjPeOXqWqtuKN2a0cM7LIpIiCEEICT0G6Ngsn/AORc4/RrAfawfgs+fxL8XRtoclSteNV8QoOV7sNy7VzPRqpR/nK2x0hjnrKlXRCAgICCEGS7OKKkuGtbdTV7GvhLnO3HDIcWtJAPrAUMkzFUqRvZ0jLFHLC6KVjXxuaWuY4ZBB6sdiyNTnraTo12l7n5RRxuNqqHfBOxwid6BP1LVjvxR9WfJTbnCg2cfl5ZP1g/u3LuTwS5j8TplZGkQEBAQEHO+2o/7wJ/1SH7y1YvCoy9YYMrVSFwEEIC6Nz7Bm4td0d21bR7GD8VmzdV+Lo22OSpWvKpGWIOYtYQim1Zd4eWKt7h4O84e5wWynhhltHxLQpIiAghAQEFVaLjJaLrSXCHO/TStkAHX2rlo3jZ2s7Tu6poKuKuooKuncHRTMD2kHPAhYpjZrjmiuo6evpZaWtgjnglaWvjkbvNcPBdidugxi1bNtOWi9xXWggqI5YSXRxmcujaSCMgHjyJ61KclpjZCKRE7wy9QTSgICAgIOdttP8AaBU/qkP3lqxeFRl6wwZWqhcEICB3IQ3psNp+j0pJPj+sVsjvUA1v1tKzZp3s0Y42q2eFUsecwyw4Qc9bWqHyPWEkwbhtXCyXPzmjcPua32rVinlsz5I5sNVisQEBBCAgFBuPYjqYTU0mnat46SHMtISfjR/Kb/hPHwPcs+WvmvxW3jZtjKpWpQEBAQEBAQc7bafy/qe+kh+8tWLwqMvWGDK1UhcBAQQTujJ5BdHSmzS3m3aPtVO5pa/oRI8H0nkud73FYrzvaWqvRmCikhw4INS7bbWZbbSXFjcuppdx5+Y/h9YarsM89lWaOW7Ty0KBAQEBBCAg97fWz22vp66if0dRTyCSN3ePsIyD3FcmN+UuxMxO8OmdIakpdT2aG4Up3XnzZojzjf1j8FktWazs1VmLRvC+qLogICAgIIyg5g2iXZl61rdK2Eh0AkEMR7WsG7n1kE+BWykbV2ZbzvbkxxSREBAQV9itzrveaK3tbkTzNa76Ocu9wK5ado3drG8uqLfGI4WgcAAAAsTX9FYgILDqq1x3a1VVFIOE0ZbnsOOBXaztO7kxvGzmSoglpaiWnnaWyxPLHg8OI4LZDJMc3wuiEBAQMoGUEIL/AKK1TVaTvLauAOkppMNqacH+kb3fOHUVG9ItCdLcMukLPd6K82+Cvt8wlp527zXciO4jqI7FkmJhoid1dlcdM+CBkdyBkdyBkdqDBdrGqxp6wupqWTFwrgY4sc2N+U/7PEqzHXilC9toc78PHxWpmEBAQEGy9itlM9xqbvKw7kA6GIkfKPE49WFTmt5LcUebekLd1gCzr3ogIPKePfaR3IND7X7CaG7Mu8LD5PVeZMR8mQcifpD/AErRity2lRlrz3hr/KuVIygZQMoCCEEoPSKCSVx3cAN5uPIKnNnpij4uvp5t2i7Oz620xjjlHWZ6R9s/krLdBV9E91LXT0zS8giKZ7Q49uGkLPqdbXBaK2rzmN3m5c/c3mkc9lV0Nz/TNb+0y/xLP+1cfyq/fp9EGG6fpmt/aZf4k/amL5T36fQ6G6fpmt/aZf4k/amP5T36fRHQ3T9M1v7TL/En7Vx/Ke/T6HQ3T9M1v7RL/En7Ux/Ke/T6LdcoqiOVrqupkqCRgPke5xx6ytum1Nc9ZmsdFlM3exuo1qWC4CAg+4IJqqaOnpWGSaV4ZG0dbicBJnZ2I3l0zoyxR2Oy01DHxMTfPfj47zxcfasdrcUtVY2jZkw5KLqUBBBGQgsGqLNT3e2VFFVRgxStI8D1H1HiuxO07uTG8ObrzbKizXKa31bSJYTje9JvUR4rZWd4ZrV2lRLqIghAQEFTR0pqHbxyIxzPb4LJqtVGGNo52nye52N2NftC/HbljjrPr9I/N9VlSC3oYP6MdnWq9Lp7V/8Ark52n8F3a/alL19z0fw4q+nn/j+6otdXBDC6KR26d7IyOYWfX6XJfJxY45PkNThte0TCt8upfzrFh9z1Pyyz+73+U8upPzzF33PU/LJ3F/RHl1J+eYuTo9T8sncX9Dy6k/PMXPc9T8sncX9EeXUn55ie56n5ZO4v6LXdalk8rREQQ0c+1exocF8OOePrLbpsc0rzUK3tAuAgckG1NkOlXPkF/rYznBbShw6uRf8AYFRlv5Qux185bpp49xgHcqFz2QEBAQecrN9pBQa72kaNbfaLp6UBlwpx8E7kJB1sP49SnS/DKF6cTRczJIZXxTRmORjt17HDBaewrXE782bpO0vhA4oKuOhklhEgc0ZHAdqxZNfjx5OCX0Gl9m9VqdN39ZiN+kec/o8qandNPuYwG/H7lZqNTXFj4/Xoydl9l5Ndqpw9Ir4p9P8AfJcZI5qqop7ZbonSVE7gxkbOZ7vx7lh0WGbWnNl/k+g9oNdXT4o7P0vKPPb+38/P7mVN2T3IbkMt4tcVc9uRSOeS7wXo97Ho+P7qVJpDRNRNrIW2+R07GUbg6opppMdOxwcBuEc+IzwUr5Ph5OUpz2l6bTNHMs91lqLUKVlHNJHFDRQv3pWuLR8k8eJz7VzHffqXx7dH1TbKbq6GIV1zttFVzN3o6SV5Lyk5vSHe6n1WGPR11Oqo9Nztjp66Qncc85YWhpOQesHBUuOOHdyKTvsuF62d3Oy2ivuVwq6RjaVwa2IE70/EDLc9XFcrliZ2LUmI33Yb4q1WIC4CAgynQmkptSXAPma5luhcOleOBefQb9p6vFV5L7RyWY6bzvLom20UdNCxkcbWMY3da1vJoHIBZWhcAglAQEBAQU88AkB4DKDWO0XQQuwfXW4NjuDRxGcNnHYew9hVlLzXr0V3pFmmJ4pIJnwzxvjlYcPY8YLStUTv0Z+nJ8IK+1zkSdE5xwfi56ivN7RwRNO8iOcPrPZbtK2PP7refht0+k/5VtQ9lNE94A3ne8rzMFL6i9aTPKPwh9X2hnwdl6fJnpWItb8ZXzYy6J20GB1SRvmmm6LPp8OXfu7y9+9Yrj2jo/L4yWyZJved5nmtuqm3D+cyqDek/lI3Bnk4473MbmO7H296nWY4ELcXG2VrUwfzuaP3N3pwJOkxzA3Tu596qp+7lbPiWG6tp/5/4vKcYMkJZnt6EY96lH7pD/0VGvKvSMWvHC82y/TXhphML6eVoY4YG7uAvHDPv3lykWmn0Tm0b9FyrLgbhtX0s+W2VlBKynna5tWGbz27rt0jdcfnc1yI2pPM33t0a+2r1c9Vrq5RzSOcyBzYo254Nbug8vWrMcRwqbzMzsxFWICAgIMk0dpCs1PVb2HQ0DDiWfHxvmt7T9X1wvkiqdKTLoKwWamtdHDS0kIihiGGMH/vNZZmZ5y0xG0L40YC4JQEBAQEBAKCnngEjSCAUGB620JS32MyA+T1rRhlQ1nucOse9Tpeao2pFmlL1Y7lYqkwXKDcPyZG8Y394P2HBWmLRPRntWYlb43lj2uHNvJL1i9ZrPmliyWx3i9eUxtsmeofOQXnlyHYoYcNMMbUhp1naGo1t+PNbf0jyh9UlVPRVUNVSSuhqIXh8cjTgtPardmLeWdN2tXvcbJLbbXJVsbuiqdCd7x5qruarO9libtRXSTUEd+lqTJcI5BI1725HDqx1DBIx3qzhiI2R4533XbVWu6/UrKfyiio6WenkEjainDhISBw4k8OajXHFUrZJlc4Nq96ZBGKqhttXUxNwyqliO+O/h1qM4Yl3vJ2WCLWF3bqiPUc0rKivZnd6RvmAEFu6ADwGCVOaRw8KPHO+63Xy6T3u7VNzq2xtnqXBzxGMNHDHD2LsRtGyMzvO6hXXBBIBJAAJJ4AAccoM+0bs3qrlIyrvjXQUowW03y5PpeiO7n4Km+XyhbXH6t2Wm1wUUDIYYmxxtG61jRgALOvXZjd0IPpAQEBAQEBAQEHnJGHtwUFmu9kp66nfDURMlieMOY9uQkTt0cmN2qdS7K3sc+axTBpPHyacnGfmv6vWr65p/iVWx894a8uVruFpl6O50U9M7qMjfNPg4cD6irotE9Fc1mOqjUkULgLoICAuAgkZLgxoJceQHMp0GUWDQV9u72vfTGipzzlqBhxHzWc/bhV2yxCyMcy2tpPQFtsYEkcJnqscZ5eLvV1AeCotebLq0iGcU9G2LqUElW0bqCUBAQEBAQEBAQEBBBAPMIPCWma8cggttdaIp2OZJGx7DzY8ZB9RTmMNvGzOyVhc5tK6neeO9A7d4+HJTjJaEJpEsTr9kszSTRXTh6M8WSfWCFZGb6I91CzVGzTUMTvgvJJR2iUtPvClGWqE4p9VK7Z9qUH+pRu8Jxhd72jndS+49nepXnBpqZn0p/wBTvauxilcaXZXd5COnraWEdYY1z/AMFHvo8oSjF6sjtuyWgY4GtqKmo7Wg7gPsUZzW8koxQzOy6Ptlqx5FQwQu9INy7281XNrT1lOIiGRQUDGY4KLqrZG1vIIPRAQEBAQEBB/9k="
				width="100" height="40" class="d-inline-block align-top" alt="Logo">
			</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
<li class="nav-item">
					<a class="nav-link active" aria-current="page" href="Register.jsp">Register</a>
				</li>
				<li class="nav-item">
					<a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
				</li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container">
    <form action="updateById" method="post">
        <h1>Govnt
        </h1>
        <div class="design">
        <div class="design">
<body>

	<div class="container">
		<h1>${msg}</h1>
		<form action="ramesh" method="post">

			<h1>Apply</h1>
			<div class="design">
				<div class="design">
					<label for="inputName">Name</label> <input type="text"
						class="form-control" id="inputName" placeholder="Enter name"
						name="enterName" onblur="ValidateName()"> <span id="Error"
						style="color: red;"> </span>
				</div>
				<div class="design">
					<div class="design">
						<label for="inputNumber">Contact Number</label> <input type="tel"
							class="form-control" id="inputNumber" placeholder="Enter number"
							name="enterNumber" onblur="validateNumber()"> <span
							id="numberError" style="color: red;"></span>
					</div>

					<div class="design">
						<div class="design">
							<label for="inputNumber">Email</label> <input type="tel"
								class="form-control" id="inputemail" placeholder="Enter email"
								name="enteremail" onblur="validateEmail()"> <span
								id="Error2"></span>
						</div>
						<div class="design">
							<div class="design">
								<label for="inputNumber">Age</label> <input type="tel"
									class="form-control" id="inputage" placeholder="Enter age"
									name="enterage" onblur="validateAge()"> <span
									id="numberError1"></span>
							</div>


							<label for="inputDate">Date of Birth</label> <input type="date"
								class="form-control" id="inputDate" placeholder="dd-mm-yyyy"
								name="enterdate" required>
						</div>
						<div class="design">
							<div class="design">
								<label for="inputNumber">Blood Group</label> <input type="tel"
									class="form-control" id="inputBlood Group"
									placeholder="Enter Blood Group" name="enterBlood Group"
									required>
							</div>
							<div class="design">
								<label for="inputNumber">Mother tongue</label> <input type="tel"
									class="form-control" id="inputMother tongue"
									placeholder="Enter Mother tongue" name="enterMother tongue"
									required>

							</div>
							<div class="design">
								<label for="inputNumber">Gender</label><br>
								 <input
									type="radio" id="male" name="male" value="male"> <label
									for="html">Male</label><br> 
									<input type="radio"
									id="female" name="male" value="female"> <label
									for="html">Female</label><br> 
									<input type="radio"
									id="others" name="male" value="others"> <label
									for="html">Others</label><br>
							</div>


							<div class="design">
								<label for="inputNumber">Marital status</label> <input
									type="tel" class="form-control" id="inputMarital status"
									placeholder="Enter Marital status" name="enterMarital status"
									required>

							</div>
							<div class="design">
								<label for="inputNumber">Nationality</label> <input type="tel"
									class="form-control" id="inputNationality"
									placeholder="Enter Nationality" name="enterNationality"
									required>

							</div>
							<div class="design">
								<label for="inputNumber">Religion</label> <input type="tel"
									class="form-control" id="inputReligion"
									placeholder="Enter Religion" name="enterReligion" required>

							</div>
							<div class="design">
								<div class="design">
									<label for="inputNumber">Address</label> <input type="tel"
										class="form-control" id="inputAddress"
										placeholder="Enter address" name="enteraddress" required>

								</div>





								<button type="submit" class="btn btn-primary" id="button"
									disabled="disabled">Submit</button>
								<button type="reset" class="btn btn-danger">Clear</button>
</form>
</div>
</body>
</html>