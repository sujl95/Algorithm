package Algorithm.Java.codingTest._20210509_summer_coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _1 {

	public static void main(String[] args) {
		String code = "012345";
		String day = "20190620";
		String[] data = {"price=80 code=987654 time=2019062113", "price=90 code=012345 time=2019062014",
				"price=120 code=987654 time=2019062010", "price=110 code=012345 time=2019062009",
				"price=95 code=012345 time=2019062111"};
		System.out.println(Arrays.toString(solution(code, day, data)));
	}

	public static int[] solution(String code, String day, String[] data) {
		List<Data> list = new ArrayList<>();
		for (int i = 0; i < data.length; i++) {
			String[] arr = data[i].split(" ");
			String priceData = "";
			String codeData = "";
			String timeData = "";
			for (int j = 0; j < arr.length; j++) {
				String[] mapArr = arr[j].split("=");
				String key = mapArr[0];
				String value = mapArr[1];
				if (key.equals("price")) {
					priceData = value;
				} else if (key.equals("code")) {
					codeData = value;
				} else {
					timeData = value;
				}
			}
			list.add(new Data(priceData, codeData, timeData));
		}
		List<Data> midList = list.stream()
				.filter(data1 -> data1.getCode().equals(code))
				.filter(data1 -> data1.getTime().startsWith(day))
				.collect(Collectors.toList());
		List<Data> resultList = midList.stream()
				.sorted(Comparator.comparing(Data::getTime))
				.collect(Collectors.toList());
		int[] answer = new int[resultList.size()];
		for (int i = 0; i < resultList.size(); i++) {
			answer[i] = Integer.parseInt(resultList.get(i).getPrice());
		}
		return answer;
	}
}

class Data {
	private String price;
	private String code;
	private String time;

	public Data(String price, String code, String time) {
		this.price = price;
		this.code = code;
		this.time = time;
	}

	public String getPrice() {
		return price;
	}


	public String getCode() {
		return code;
	}

	public String getTime() {
		return time;
	}

	@Override
	public String toString() {
		return "Data{" +
				"price='" + price + '\'' +
				", code='" + code + '\'' +
				", time='" + time + '\'' +
				'}';
	}
}