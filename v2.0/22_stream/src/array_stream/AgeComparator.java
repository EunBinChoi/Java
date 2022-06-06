package array_stream;

import java.util.Comparator;

import overview.Member;

public class AgeComparator implements Comparator<Member> {

	@Override
	public int compare(Member o1, Member o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2) * -1;
	}

}
