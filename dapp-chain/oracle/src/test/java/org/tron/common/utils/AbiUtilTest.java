package org.tron.common.utils;

import com.beust.jcommander.internal.Lists;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class AbiUtilTest {

  @Test
  public void unpackOracleSigns() {
    String data = "00000000000000000000000000000000000000000000000000000000000000200000000000000000000000000000000000000000000000000000000000000004000000000000000000000000000000000000000000000000000000000000008000000000000000000000000000000000000000000000000000000000000000c00000000000000000000000000000000000000000000000000000000000000100000000000000000000000000000000000000000000000000000000000000014000000000000000000000000000000000000000000000000000000000000000051234567890000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000622222222901100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000007033333338902220000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000074444444490333300000000000000000000000000000000000000000000000000";
    List<String> strings = AbiUtil.unpackOracleSigns(ByteArray.fromHexString(data));
    List<String> result = Lists
        .newArrayList("1234567890", "222222229011", "03333333890222", "44444444903333");
    Assert.assertArrayEquals(strings.toArray(), result.toArray());
  }
}