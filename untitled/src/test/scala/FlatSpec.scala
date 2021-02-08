import org.scalatest.flatspec.AnyFlatSpec
class FlatSpec extends AnyFlatSpec {

  behavior of "the tv"

  "when calling the isOn()" should "return true" in{
    val tv = new TV(true)

    val value = tv.isOn()

    assert(value == true)

  }


}
