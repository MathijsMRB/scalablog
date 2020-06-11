val movies =
  <movies>
    <movie genre="action">Pirates of the caribbean</movie>
    <movie genre="fairytale">Edward Scissorhands</movie>
  </movies>

movies.text

val movieNodes = movies \ "movie"
movieNodes.head
movieNodes.head \ "@genre"