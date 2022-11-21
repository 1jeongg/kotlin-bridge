package bridge

import camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest
import camp.nextstep.edu.missionutils.test.NsTest
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class InputViewTest: NsTest() {
    @Test
    fun `다리 개수 테스트`() {
        val bridgeSize = BridgeException("12").toBridgeSize()
        Assertions.assertThat(bridgeSize).isEqualTo(12)
    }
    @Test
    fun `다리 개수 예외 테스트`() {
        InputView().readBridgeSize()
        assertSimpleTest {
            run{ "12sdf3" }
            Assertions.assertThat(output()).contains("[ERROR]")
        }
    }
    @Test
    fun `다리 이동 입력칸 테스트`() {
        val bridgeMoving = BridgeException("U").toBridgeMoving()
        Assertions.assertThat(bridgeMoving).isEqualTo("U")
    }
    @Test
    fun `다리 이동 입력칸 예외 테스트`() {
        InputView().readMoving()
        assertSimpleTest {
            run{ "21" }
            Assertions.assertThat(output()).contains("[ERROR]")
        }
    }

    override fun runMain() {
        TODO("Not yet implemented")
    }
}