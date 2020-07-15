mkdir Animals
mkdir Animals/Snakes
cd Animals/Snakes
touch boa.snk
touch cobra.snk
echo "Is this venomous?" > boa.snk
echo "Is this poisonous?" > cobra.snk
cp boa.snk rattle.snk

mkdir Animals/Reptiles
cd Snakes
mv rattle.snk ../Reptiles
cat cobra.snk
mv cobra.snk ../Reptiles
ls
rm boa.snk
cd ..
rmdir Snakes
