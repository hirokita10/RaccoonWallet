package wacode.yamada.yuki.nempaymentapp.usecase

import wacode.yamada.yuki.nempaymentapp.repository.AddressBookRepository
import javax.inject.Inject


class AddressBookUseCase @Inject constructor(private val addressBookRepository: AddressBookRepository) {

    fun getFriendInfo(friendId: Long) = addressBookRepository.getFriendInfoById(friendId)

    fun getFriendIcon(friendId: Long) = addressBookRepository.getFriendIconById(friendId)
}