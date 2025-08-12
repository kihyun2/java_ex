package ch10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CarDemo {
	public static void main(String[] args) {
		List<Car> list = Car.cars.subList(0, 3);
		System.out.println(list.size());
		Car[] cars = list.toArray(new Car[3]);

		Arrays.sort(cars);
		System.out.println(Arrays.toString(cars));

		Comparator<Car> modelComparator = Comparator.comparing(Car::getMileage);
		Arrays.sort(cars, modelComparator);
		System.out.println(Arrays.toString(cars));

		Comparator<Car> milageComparator2 = Comparator.comparing(c -> c.getMileage());
		Arrays.sort(cars, milageComparator2);
		System.out.println(Arrays.toString(cars));

		Comparator<Car> ageComparator3 = Comparator.comparing(c -> c.getAge());
		Arrays.sort(cars, ageComparator3);
		System.out.println(Arrays.toString(cars));
	}

//	public static List<Car> findCars(List<Car> all, CarPredicate cp) {
//		List<Car> result = new ArrayList<>();
//		for (Car car : all) {
//			if (cp.test(car)) {
//				result.add(car);
//			}
//		}
//		return result;
//	}
//
//	public static void printCars(List<Car> all, CarConsumer cc) {
//		for (Car car : all) {
//			cc.apply(car);
//		}
//	}
}