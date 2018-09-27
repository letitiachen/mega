package DataCrawler;

import java.io.OptionalDataException;
import java.util.Optional;

import DataCrawler.model.ConfigManager;
import falseapple.GeneralLib.helpers.IOUtil;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//final Optional<Long> op = testop(1);
		try {
			//Optional<Long> op = testop("a");
			//System.out.println(op);
			//System.out.println( op.isPresent());
			//System.out.println( op.isPresent() ? op.get() : false);
			final String teststr = ConfigManager.getProperties("xxxtestx");
			if (teststr!=null || "".equals(teststr)) {
				System.out.println("127");
			} else {
				System.out.println(teststr);
			}

			final Optional<Map<String, String>> onlineList = getOnlineListInRedis();
			data.setItem1("線上人數");
			data.setValue1(String.valueOf(onlineList.isPresent() ? onlineList.get().size() : 0));
			data.setItem3("待下線人數");
			data.setValue3(String.valueOf(offlineDatas.size()))

		}finally {

		}

	}

	static public Optional<Long> testop(final String key) {
        try {
            return Optional.of(testre(key));
        } catch (RuntimeException e) {
            System.out.println("exception:"+IOUtil.traceToString(e));
        }
        System.out.println("2");
        return Optional.empty();
    }

	static public long testre(final String key) {
        try {
            return Long.parseLong(key);
        } finally {
            System.out.println("testre-finally");
        }

    }

}
