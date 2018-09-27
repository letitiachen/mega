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

			data.setItem2("待上線人數");
			data.setValue2(String.valueOf(onlineDatas.size()));

		}finally {

		}

	}

	static public Optional<Long> testop(final String key) {
        try {
            return Optional.of(testre(key));
        } catch (RuntimeException e) {
            //Logger.fatal(Recorders.system(), LogStamp.SYSTEM_EXCEPTION, IOUtil.traceToString(e));
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
