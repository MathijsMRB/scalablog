val reg = """^([Ff])\w*""".r
reg.findFirstIn("Fantastic")
reg.findFirstIn("not Fantastic")

val reg2 = "the".r
reg2.findAllIn("the way the scissors trim the hair and the shrubs")
