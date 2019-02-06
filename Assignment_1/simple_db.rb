require 'gdbm'

gdbm = GDBM.new("assignment1.db")
gdbm["London"]    = "4"
gdbm["San Francisco"]    = "10"
gdbm["Beijing"] = "3020"
gdbm["Tokyo"]    = "42"
gdbm["Seoul"]    = "1030"
gdbm["Copenhagen"]    = "42"
gdbm.close