val movies =
  <movies>
    <movie>The Incredibles</movie>
    <movie>WALL E</movie>
    <short>Jack Jack Attack</short>
    <short>Geri's Game</short>
  </movies>

(movies \ "_").foreach {
  case <movie>
    {movieName}
    </movie> => println(movieName)
  case <short>
    {shortName}
    </short> => println(shortName + " (short)")
}