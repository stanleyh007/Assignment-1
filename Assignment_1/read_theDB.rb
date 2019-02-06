require 'gdbm'

gdbm = GDBM.new("assignment1.db")
gdbm.each_pair do |key, value|
  print "#{key}: #{value}\n"
end
gdbm.close