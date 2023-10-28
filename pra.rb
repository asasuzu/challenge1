s = 1343034000
count = 0
(10000..99999).each do |n|
  if s % n == 0
    count += 1
  end
end
puts count