
// czyszczenie kodu
#include <iostream>
#include <algorithm>

using namespace std;
int spr_max(int a, int b, int c)
{
	int maximum;

	if ((a > b) && (a > c)) maximum = a; //optymalizacja części kodu 
	if ((b > a) && (b > c)) maximum = b; //mniejsza ilość linii powoduje większą czytelność
	if ((c > a) && (c > b)) maximum = c;

	return maximum;

}
int spr_min(int a, int b, int c)
{
	int minimum;

	//optymalizacja kodu 
	if ((a < b) && (a < c)) minimum = a;
	if ((b < a) && (b < c)) minimum = b;
	if ((c < a) && (c < b)) minimum = c;


	return minimum;

}

bool positive(int x) {

	if (x >= 0)
		return true;
	else
		return false;
}




int main()
{
	cout << spr_max(-1, 8, 1) << endl;
	cout << spr_min(-20, -40, -30) << endl; // sprawdzenie poprawności programu
	cout << positive(5) << endl;// sprawdzenie poprawności programu
	return 0;
}