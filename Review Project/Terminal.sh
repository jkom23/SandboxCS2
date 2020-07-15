mkdir Review
mkdir Review/Emacs
mkdir Review/Java
cd Review
mkdir Java/Variables
touch Java/Variables/a.box
cd Java/Variables
touch b.box
echo "bumble.b" > b.box
touch c.box
cp b.box ../
cd ..
mkdir Loops
mv b.box Loops/
cd Loops
echo "For a while" > b.box
mv b.box for.loop
cd ../..
touch Java/Loops/while.loop
cat Java/Loops/for.loop